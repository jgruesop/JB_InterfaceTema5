package org.example;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Se ha guardado el coche");
    }

    @Override
    public void findAll() {
        System.out.println("Se han listado todos los coches");
    }

    @Override
    public void delete() {
        System.out.println("Se ha eliminado el coche");
    }
}
