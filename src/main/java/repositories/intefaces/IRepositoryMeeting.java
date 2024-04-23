package repositories.intefaces;

import entities.MeetingOfLesson;

public interface IRepositoryMeeting {

    public long createMeetingByLessonId(long id);
    public void deleteMeetingByLessonId(long id);
}
