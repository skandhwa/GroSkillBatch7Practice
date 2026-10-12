const fs = require('fs');
const path = require('path');

function getBrowserName() {

    // Step 1: Create the path of Global.properties
    const filePath = path.join(
        __dirname,
        '..',
        'test-data',
        'Global.properties'
    );

    // Step 2: Check whether the file exists
    const fileExists = fs.existsSync(filePath);

    if (fileExists === false) {
        return 'chromium';
    }

    // Step 3: Read the file
    const fileData = fs.readFileSync(filePath, 'utf8');

    // Step 4: Convert file data into lines
    const lines = fileData.split(/\r?\n/);

    // Step 5: Find the browser line
    let browserName = 'chromium';

    for (let i = 0; i < lines.length; i++) {

        const line = lines[i].trim();

        if (line.startsWith('browser=')) {

            // Example:
            // browser=chrome

            const browserValue = line.split('=');

            browserName = browserValue[1].trim().toLowerCase();

            break;
        }
    }

    // Step 6: Return browser name
    return browserName;
}

module.exports = {
    getBrowserName
};


