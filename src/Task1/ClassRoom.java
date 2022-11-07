package Task1;

public class ClassRoom {

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        Pupil[] classRoom = new Pupil[4];

        classRoom[0] = pupil1;
        classRoom[1] = pupil2;
        classRoom[2] = pupil3;
        classRoom[3] = pupil4;

        for (int i = 0; i < classRoom.length; i++){
            classRoom[i].study();
            classRoom[i].read();
            classRoom[i].write();
            classRoom[i].relax();
            System.out.println("*************************************");
        }
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        Pupil[] classRoom = new Pupil[3];

        classRoom[0] = pupil1;
        classRoom[1] = pupil2;
        classRoom[2] = pupil3;

        for (int i = 0; i < classRoom.length; i++){
            classRoom[i].study();
            classRoom[i].read();
            classRoom[i].write();
            classRoom[i].relax();
            System.out.println("*************************************");
        }
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2){
        Pupil[] classRoom = new Pupil[2];

        classRoom[0] = pupil1;
        classRoom[1] = pupil2;

        for (int i = 0; i < classRoom.length; i++){
            classRoom[i].study();
            classRoom[i].read();
            classRoom[i].write();
            classRoom[i].relax();
            System.out.println("*************************************");
        }
    }
}
