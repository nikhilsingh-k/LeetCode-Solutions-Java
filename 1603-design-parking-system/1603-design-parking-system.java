class ParkingSystem {
    int a[] = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        a[0] = big;
        a[1] = medium;
        a[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(a[carType-1]>0){
            a[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */