package osobe;

public class Osoba {
    String ime, prezime;   // no usages
    String oib;   // 1 usage
    String getOib() {     // no usages
        return oib;
    }
}

class Student extends Osoba {    // 1 usage, 1 inheritor
    int matBrojStudenta;    // 1 usage
    int getMatBrojStudenta() {    // no usages
        return matBrojStudenta;
    }
}

class Profesor extends Osoba {    // no usages
}

class Apsolvent extends Student {    // no usages
}