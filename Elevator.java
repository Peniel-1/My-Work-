package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
    }

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp(int desiredFloor) {
        if (desiredFloor <= getNumberOfFloors() && desiredFloor > currentFloor && isDoorOpen() != true) {
                currentFloor = desiredFloor;

                }

            }



    public void goDown(int desiredFloor) {
        if (isDoorOpen() != true) {
            if (desiredFloor >= 1 && getCurrentFloor() > desiredFloor && desiredFloor < numberOfFloors && !isDoorOpen()){
                currentFloor = desiredFloor;
            }
        }
    }
}




