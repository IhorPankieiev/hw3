package Task1;

public class Main {
    public static void main(String[] args) {
        ExcelentPupil pupil1 = new ExcelentPupil();
        GoodPupil pupil2 = new GoodPupil();
        GoodPupil pupil3 = new GoodPupil();
        BadPupil pupil4 = new BadPupil();

        ClassRoom classRoomOfFour = new ClassRoom(pupil1,pupil2,pupil3,pupil4);
//        ClassRoom classroomOfThree = new ClassRoom(pupil1,pupil2,pupil3);
//        ClassRoom classroomOfTwo = new ClassRoom(pupil3,pupil4);
    }
}
