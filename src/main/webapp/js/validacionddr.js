function validarFecha(fecha) {  
      
    try{        
        var fecha = fecha.split("/");        
        var day = fecha[0];        
        var month = fecha[1];        
        var year = fecha[2];        
        var estado = true;  
         
        if ((day.length == 2) && (month.length == 2) && (year.length == 4)) {        
            switch (parseInt(month)) {        
                case 1:dmax = 31;break;        
                case 2: if (year % 4 == 0) dmax = 29; else dmax = 28;        
                break;        
                case 3:dmax = 31;break;        
                case 4:dmax = 30;break;        
                case 5:dmax = 31;break;        
                case 6:dmax = 30;break;        
                case 7:dmax = 31;break;        
                case 8:dmax = 31;break;        
                case 9:dmax = 30;break;        
                case 10:dmax = 31;break;       
                case 11:dmax = 30;break;      
                case 12:dmax = 31;break;       
            }  
              
            dmax!=""?dmax:dmax=-1;if ((day >= 1) && (day <= dmax) && (month >= 1) && (month <= 12)) {        
            for (var i = 0; i < fecha[0].length; i++) {         
                dayC = fecha[0].charAt(i).charCodeAt(0);        
                (!((dayC > 47) && (dayC < 58)))?estado = false:'';       
                monthC = fecha[1].charAt(i).charCodeAt(0);        
                (!((monthC > 47) && (monthC < 58)))?estado = false:'';       
            }  
         
        } for (var i = 0; i < fecha[2].length; i++) {  
         
        yearC = fecha[2].charAt(i).charCodeAt(0);  
         
        (!((yearC > 47) && (yearC < 58)))?estado = false:'';        
        }} else estado = false;        
        return estado;    
        
   }catch(err){  
    alert("Error fechas");    
 }
}