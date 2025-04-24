public class Temp{
    //ATRIBUTO PRIVADO PARA ARMAZENAR TEMP - CELSIUS
    private double tempCelsius;
    
    //CONSTRUTOR -  CRIAR O OBEJETO COM UMA TEMP INICIAL 
    public Temp(double tempInicialCelsius) {
        this.tempCelsius = tempInicialCelsius;
    }
        
        // GETTER - PARA LER A TEMPERATURA
        public double getTempCelsius() {
            return tempCelsius;
           
        }
        
        //SETTER - PRA MUDAR A TEMPERATURA 
        public void setTempCelsius(double mudarTempCelsius) {
            this.tempCelsius = mudarTempCelsius;
        }
        // MÉTODO PARA CONVERTER CELSIUS PARA FAHRENHEIT
        public double converteParaFahrenheit(){
            return (tempCelsius*9/5)+32;
        }
        //MÉTODO PARA CONVERTER CELSIUS PARA KELVIN 
        public double converteParaKenvin() {
            return tempCelsius+273.15;
        }
    }

