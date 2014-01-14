/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

import java.util.Calendar;

/**
 * Recurrence schedule for the job.
 */
public class JobRecurrence
{
    private Integer count;

    /**
     * Count of occurrences that will execute. Optional. Default will recur
     * infinitely
     */
    public Integer getCount()
    {
        return this.count;
    }

    /**
     * Count of occurrences that will execute. Optional. Default will recur
     * infinitely
     */
    public void setCount(Integer count)
    {
        this.count = count;
    }

    private Calendar endTime;

    /**
     * Time in ISO-8601 format after which no more occurrences will execute.
     */
    public Calendar getEndTime()
    {
        return this.endTime;
    }

    /**
     * Time in ISO-8601 format after which no more occurrences will execute.
     */
    public void setEndTime(Calendar endTime)
    {
        this.endTime = endTime;
    }

    private JobRecurrenceFrequency frequency;

    /**
     * The frequency of recurrence.
     */
    public JobRecurrenceFrequency getFrequency()
    {
        return this.frequency;
    }

    /**
     * The frequency of recurrence.
     */
    public void setFrequency(JobRecurrenceFrequency frequency)
    {
        this.frequency = frequency;
    }

    private Integer interval;

    /**
     * Interval of the recurrence at the given frequency.
     */
    public Integer getInterval()
    {
        return this.interval;
    }

    /**
     * Interval of the recurrence at the given frequency.
     */
    public void setInterval(Integer interval)
    {
        this.interval = interval;
    }

    private JobRecurrenceSchedule schedule;

    /**
     * Recurrence schedule for the job.
     */
    public JobRecurrenceSchedule getSchedule()
    {
        return this.schedule;
    }

    /**
     * Recurrence schedule for the job.
     */
    public void setSchedule(JobRecurrenceSchedule schedule)
    {
        this.schedule = schedule;
    }

    /**
     * Initializes a new instance of the JobRecurrence class.
     * 
     */
    public JobRecurrence()
    {
    }
}
