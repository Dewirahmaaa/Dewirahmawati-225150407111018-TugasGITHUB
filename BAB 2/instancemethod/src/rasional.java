public class rasional {
   
    private int pembilang, penyebut;
    public rasional(){
        pembilang=0;
        penyebut=0;
    }
    public rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }
        //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }
        //menyederhanakan bilangan rasional
    public void Sederhana(){
        int temp, A, B;
    if (penyebut ==0){
        return;
    }
    A = (pembilang<penyebut) ? penyebut:pembilang;
    B = (pembilang<penyebut) ? pembilang:penyebut;
    
    while (B != 0){
        temp= A % B;
        A = B;
        B = temp;
    }
    //jawaban no 3
    //while diubah menjadi for
    for (int i = B; i > 0; i--){
        temp = A % B;
        A = B;
        B = temp;
    }
    pembilang /=A;
    penyebut /=A;
    }
    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }
    //jawaban no 2
        //operator >
    public boolean moreThan (rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
       //operator <
    public boolean lessThan (rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
      //operator <=
    public boolean lessThanEqual (rasional A){
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
      //operator >=
    public boolean moreThanEqual (rasional A){
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
       //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }
    //jawaban no 4
      //operator unary += \
    public void unaryPlus(rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
      //operator unary -= \
    public void unaryMinus(rasional A){
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
      //operator unary *= \
    public void unaryTimes(rasional A){
        pembilang = pembilang * A.penyebut * penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }
      //operator unary /= \
    public void unaryDivide(rasional A){
        pembilang = pembilang * A.penyebut / penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }
    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}

