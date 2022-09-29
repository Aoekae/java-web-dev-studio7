package org.launchcode.studio7;

public abstract class OpticalDisk {
    private String name;
    private int capacityInGb;
    private Data contents;
    private String discType;

    public void readData() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacityInGb);
        System.out.println("Contents: " + contents);
        System.out.println("Disc Type: " + discType);
    }
}
