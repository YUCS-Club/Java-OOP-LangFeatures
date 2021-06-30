package com.csculb.interfaceDemo;

public class StudentRepository implements BaseRepository {

    @Override
    public void save(Savable entity) {

        // Real data saving operation here...
        System.out.println("Saving student...");

        System.out.println(entity.getName());
    }
}
