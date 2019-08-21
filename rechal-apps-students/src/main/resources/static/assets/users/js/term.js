/**
 * 生成学期编号
 */
function termNo(){
	var myDate=new Date();
	var month=myDate.getMonth();
	var year=myDate.getFullYear();
	var examNum=1;
	var termNum=1;
	if(month>8) {
		termNum=2;
		examNum=month-8;
	} else {
		examNum=month-1;
	}
	return year.toString()+'T'+termNum.toString()+'0'+examNum.toString() + 'G60';
}