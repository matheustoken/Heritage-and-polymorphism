# Educational Platform System

## Description
You have been hired to create a system for an **online learning platform**. Your task is to develop a program that reads the data of the **lessons** in a course, and then displays the **total duration** of the course, which is the sum of the durations of each lesson.

### Lesson Types:
1. **Video Lesson**: This type includes:
   - **Title**
   - **URL**
   - **Duration in seconds**

2. **Task Lesson**: This type includes:
   - **Title**
   - **Description**
   - **Number of questions**

   The duration of a task is calculated as **5 minutes per question**. For example, if a task has 3 questions, its duration is **15 minutes** (or **900 seconds**).

### Requirements:
1. **Lesson Class**: Create a base class called `Lesson` with an abstract method `duration()`, which will return the duration of the lesson in seconds.

2. **VideoLesson Class**: Create a subclass of `Lesson` that represents a video lesson. This class should include the following attributes:
   - **Title**
   - **URL**
   - **Duration** (in seconds)
   The `duration()` method in this class should return the duration of the video lesson.

3. **TaskLesson Class**: Create another subclass of `Lesson` for task lessons. This class should include:
   - **Title**
   - **Description**
   - **Number of questions**
   The `duration()` method in this class should calculate the duration as **5 minutes per question**, returning the total duration in seconds.

4. **Storing Lessons**: Use a single `List<Lesson>` to store all lessons in the course.

5. **Polymorphism**: The call to the `duration()` method should be polymorphic, meaning it should work correctly regardless of whether the lesson is a video or a task.

### Objective:
- Implement the `Lesson` class and its subclasses for **VideoLesson** and **TaskLesson**.
- Store the lessons in a `List<Lesson>` and calculate the total duration of the course by summing the durations of all lessons.

## Example Output:


### Class Structure:
- **Lesson Class**: Base class with an abstract `duration()` method.
- **VideoLesson Class**: Inherits from `Lesson`, stores video attributes, and calculates duration.
- **TaskLesson Class**: Inherits from `Lesson`, stores task attributes, and calculates duration.

## Technologies Used:
- **Heritage**.
- **polymorphism**.

## Actor:
Matheus Accorsi


