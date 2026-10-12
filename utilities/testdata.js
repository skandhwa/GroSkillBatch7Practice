const XLSX= require('xlsx')
const path=require('path')

function getURLFromExcel()
{
   const filePath= path.join(__dirname, '..','test-data','TestData24thFeb.xlsx');
   const workbook=    XLSX.readFile(filePath);
   const sheet= workbook.Sheets[workbook.SheetNames[0]];
   const url=sheet['A2']?.v;
   return String(url)



}


function generateEmail()
{
    const x=Math.random().toString(36).slice(2,12);
    return `tom${x}@gmail.com`

}



module.exports = {
    getURLFromExcel,
    generateEmail
};
