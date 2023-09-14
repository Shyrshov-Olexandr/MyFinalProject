package myfinalproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AppStatusDTO {
    private int TotalCount;
    private int InWork;
    private int New;
    private int Agree;
    private int Disagree;
    private int Dubbing;
}