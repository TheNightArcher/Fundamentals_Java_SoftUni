import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCourse_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> lesson = Arrays.stream(scanner.nextLine()
                .split("," + "\\s+")).collect(Collectors.toList());


        String titles = scanner.nextLine();

        while (!titles.equals("course start")) {

            String[] date = titles.split(":");
            String dateName = date[0];

            String lessonName = date[1];

            switch (dateName) {
                case "Add":

                    if (!lesson.contains(lessonName)) {
                        lesson.add(lessonName);
                    }

                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(date[2]);
                    if (!lesson.contains(lessonName)) {
                        if (insertIndex >= 0 && insertIndex < lesson.size()) {
                            lesson.add(insertIndex, lessonName);
                        }
                    }
                    break;
                case "Remove":
                    String exerciseTitles = lessonName + "-Exercise";

                    if (lesson.contains(lessonName) && lesson.contains(exerciseTitles)) {
                        lesson.remove(lessonName);
                        lesson.remove(exerciseTitles);
                    }
                    lesson.remove(lessonName);
                    lesson.remove(lessonName);
                    break;
                case "Swap":

                    String lessonName2 = date[2];

                    if (lesson.contains(lessonName) && lesson.contains(lessonName2)) {

                        int firstLessonIndex = lesson.indexOf(lessonName);
                        int secondLessonIndex = lesson.indexOf(lessonName2);

                        String tempIndex = lesson.get(firstLessonIndex);

                        lesson.set(firstLessonIndex, lessonName2);
                        lesson.set(secondLessonIndex, tempIndex);


                        if (lesson.contains(lessonName + "-Exercise")) {
                            String tempName = lessonName + "-Exercise";
                            lesson.remove(lessonName + "-Exercise");


                            if (secondLessonIndex + 1 <= lesson.size() - 1) {
                                lesson.add(secondLessonIndex + 1, tempName);
                            } else {
                                lesson.add(tempName);
                            }
                        } else if (lesson.contains(lessonName2 + "-Exercise")) {
                            String tempName = lessonName2 + "-Exercise";
                            lesson.remove(lessonName2 + "-Exercise");


                            if (firstLessonIndex + 1 <= lesson.size() - 1) {
                                lesson.add(firstLessonIndex + 1, tempName);

                            } else {
                                lesson.add(tempName);
                            }
                        }
                    }
                    break;
                case "Exercise":
                    String newValue = lessonName + "-Exercise";


                    if (lesson.contains(lessonName)) {
                        if (!lesson.contains(lessonName + "-Exercise")) {
                            int indexOf = lesson.indexOf(lessonName);
                            if (indexOf <= lesson.size() - 1) {
                                lesson.add(indexOf + 1, newValue);
                            } else {
                                lesson.add(newValue);
                            }
                        }
                    }
                    else{
                        lesson.add(lessonName);
                        lesson.add(newValue);
                    }
                    break;
            }

            titles = scanner.nextLine();
        }
        int counter = 0;
        for (String lessons : lesson) {

            counter++;

            System.out.printf("%d.%s%n", counter, lessons);
        }
    }
}
