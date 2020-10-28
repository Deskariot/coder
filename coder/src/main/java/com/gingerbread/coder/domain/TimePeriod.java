package com.gingerbread.coder.domain;

import java.util.Date;

/**
 * todo Document type TimePeriod
 */
public class TimePeriod {

    //period when it is possible to send a solution for a task

    private Date beginOfPeriod;

    private Date endOfPeriod;

    public Date getBeginOfPeriod() {
        return beginOfPeriod;
    }

    public void setBeginOfPeriod(Date beginOfPeriod) {
        this.beginOfPeriod = beginOfPeriod;
    }

    public Date getEndOfPeriod() {
        return endOfPeriod;
    }

    public void setEndOfPeriod(Date endOfPeriod) {
        this.endOfPeriod = endOfPeriod;
    }


}
