package entities;

// Abstract sınıflar, sınıf özelliği gösterir. O yüzden bir sınıf sadece bir abstract sınıfı inherit edebilir.
// Bir sınıf sadece bir abstract classı veya başka bir classı inherit edebilir.
//Abstract interfaceler asla new'lenemez
public interface ICreditManager {
    void calculate();
    void save();
}