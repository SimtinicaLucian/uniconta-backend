package com.apsoft.conta.finance.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "incasari")
public class Incasari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "data")
    private String data;

    @Column(name = "furnizor")
    private String furnizor;

    @Column(name = "number")
    private int number;

    @Column(name = "detalii")
    private String detalii;

    @Column(name = "sumaTotala")
    private double sumaTotala;

    @Column(name = "sumaFaraTVA")
    private double sumaFaraTVA;

    @Column(name = "sumaTVA")
    private double sumaTVA;

    @Column(name = "month")
    private String month;




//    String [] dateParts = data.split(".");
//    String day = dateParts[0];
//    String month = dateParts[1];
//    String year = dateParts[2];


    public Incasari(IncasariBilder builder){
        this.data = builder.data;
        this.furnizor = builder.furnizor;
        this.number = builder.number;
        this.detalii = builder.detalii;
        this.sumaTotala = builder.sumaTotala;
        this.sumaFaraTVA = builder.sumaFaraTVA;
        this.sumaTVA = builder.sumaTVA;
        this.month = builder.month;



    }



    public static class IncasariBilder{

        private String data;
        private String furnizor;
        private int number;
        private String detalii;
        private double sumaTotala;
        private double sumaFaraTVA;
        private double sumaTVA;
        private String month = data.substring(3,5);



        public IncasariBilder(String data, String furnizor, int number, String detalii, double sumaTotala, double sumaFaraTVA, double sumaTVA, String month) {
            this.data = data;
            this.furnizor = furnizor;
            this.number = number;
            this.detalii = detalii;
            this.sumaTotala = sumaTotala;
            this.sumaFaraTVA = sumaFaraTVA;
            this.sumaTVA = sumaTVA;
            this.month = month;


        }

        public IncasariBilder(){

        }

        public IncasariBilder data(String data) {
            this.data = data;
            return this;
        }

        public IncasariBilder furnizor(String furnizor) {
            this.furnizor = furnizor;
            return this;
        }

        public IncasariBilder number(int number) {
            this.number = number;
            return this;
        }

        public IncasariBilder detalii(String detalii) {
            this.detalii = detalii;
            return this;
        }

        public IncasariBilder sumaTotala(double sumaTotala) {
            this.sumaTotala = sumaTotala;
            return this;
        }

        public IncasariBilder sumaFaraTVA(double sumaFaraTVA) {
            this.sumaFaraTVA = sumaFaraTVA;
            return this;
        }

        public IncasariBilder sumaTVA(double sumaTVA) {
            this.sumaTVA = sumaTVA;
            return this;
        }


        public IncasariBilder month(String month) {
            this.month = month;
            return this;
        }



        public Incasari build(){
            Incasari incasari = new Incasari(this);
            return incasari;
        }

    }

//    public class data{
//        String [] dateParts = data.split(".");
//        String day = dateParts[0];
//        String month = dateParts[1];
//        String year = dateParts[2];
//    }


}
