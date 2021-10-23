public class Run {
    public static String pasOrFail(int cake, int wage) {
        if (wage < 0 || cake < 0 ||wage>500000||cake>500000) return "Invalid Input";
        else if(cake<wage)  return "Gia tien sai";
        else if(cake==0) return "Khong giam";
        else {
            float rate=(float)(cake-wage)/cake*100 ;
            if (rate>=0 && rate <5) return "Khong giam";
            else if(rate>=5 && rate <10) return "5%";
            else if(rate>=10 && rate <20) return "10%";
            else if(rate>=20 && rate <30) return "20%";
            else return "30%";
        }
    }
}




