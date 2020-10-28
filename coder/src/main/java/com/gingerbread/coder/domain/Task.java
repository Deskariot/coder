package com.gingerbread.coder.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;
    @Column
    private String course;
    @Column
    private String description;
    @Column
    private DifficultyLevel difficultyLevel;

    private List<IOExample> ioExample;

    private JavaTemplate javaTemplate;
    @Column
    private TimePeriod timePeriod;

    private Solution referenceSolution;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<IOExample> getIoExample() {
        return ioExample;
    }

    public void setIoExample(List<IOExample> ioExample) {
        this.ioExample = ioExample;
    }

    public JavaTemplate getJavaTemplate() {
        return javaTemplate;
    }

    public void setJavaTemplate(JavaTemplate javaTemplate) {
        this.javaTemplate = javaTemplate;
    }

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Solution getReferenceSolution() {
        return referenceSolution;
    }

    public void setReferenceSolution(Solution referenceSolution) {
        this.referenceSolution = referenceSolution;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
