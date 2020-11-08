package assignment7;

public class HospitalRoom {
    private Doctor1 doc;
    private static int numberOfDoctor = 0;
    private static int numberOfPatient = 0;
    private boolean entered = false;

    public HospitalRoom() {

    }

    public synchronized boolean doctorEnter(Doctor1 d) throws InterruptedException {
        if (numberOfDoctor == 0) {
            entered = true;
            this.doc = d;
            numberOfDoctor++;
            System.out.println("Doctor " + d + " entered, number of doctor " + numberOfDoctor);
            return entered;
        } else {
            System.out.println("Doctor " + d + " is waiting to Enter, number of doctor " + numberOfDoctor);
            return false;
        }
    }

    public synchronized boolean doctorLeave(Doctor1 d) throws InterruptedException {
        if (entered) {
            numberOfDoctor--;
            System.out.println("Doctor " + d + " left, number of doctor " + numberOfDoctor);
            entered = false;
            return true;
        } else {
            return false;
        }
    }

    public synchronized boolean patientEnter(Patient1 p) throws InterruptedException {
        if (numberOfPatient < 3) {
            numberOfPatient++;
            System.out.println("Patient " + p + " entered, number of patients " + numberOfPatient);
            return true;
        } else {
            System.out.println("Patient " + p + " is waiting to enter, number of patients " + numberOfPatient);
            return false;
        }
    }

    public synchronized boolean patientLeave(Patient1 p) throws InterruptedException {
        if (entered) {
            numberOfPatient--;
            System.out.println("Patient " + p + " left, number of patients " + numberOfPatient);
            entered = false;
            return true;
        } else {
            return false;
        }
    }

}

class Doctor1 {
    public String name;
    public Doctor1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor " + this.name;
    }
}

class Patient1 {
    public String name;
    public Patient1(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Patient " + this.name;
    }
}


class Main3 {
    public static void main(String[] args) {
        HospitalRoom1 room = new HospitalRoom1();
        Doctor1 siva = new Doctor1("siva");
        Doctor1 john = new Doctor1("john");
        Patient1 p1 = new Patient1("p1");
        Patient1 p2 = new Patient1("p2");
        Patient1 p3= new Patient1("p3");
        Patient1 p4 = new Patient1("p4");
        Patient1 p5 = new Patient1("p5");
        Thread doctor1 = new Thread(() -> {
            try {
                while(!room.doctorEnter(siva)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(siva)) {}

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread doctor2 = new Thread(() -> {
            try {
                while(!room.doctorEnter(john)) {}
                Thread.sleep(500);
                while(!room.doctorLeave(john)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient1 = new Thread(() -> {
            try {
                while(!room.patientEnter(p1)) {}
                Thread.sleep(500);
                while(!room.patientLeave(p1)) {}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient2 = new Thread(() -> {
            try {
                while(!room.patientEnter(p2)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p2)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient3 = new Thread(() -> {
            try {
                while(!room.patientEnter(p3)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p3)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient4 = new Thread(() -> {
            try {
                while(!room.patientEnter(p4)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p4)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread patient5 = new Thread(() -> {
            try {
                while(!room.patientEnter(p5)) {};
                Thread.sleep(500);
                while(!room.patientLeave(p5)) {};
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        doctor1.start();
        doctor2.start();
        patient1.start();
        patient2.start();
        patient3.start();
        patient4.start();
        patient5.start();
    }
}