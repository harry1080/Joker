package com.lucifaer.network.learn;

import java.util.Date;

/**
 * @author Lucifaer
 * @version 1.0.0.RELEASE
 * @since 2020/11/17
 */
public class UnixTime {
    private final long value;

    public UnixTime() {
        this(System.currentTimeMillis() / 1000L + 2208988800L);
    }

    public UnixTime(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
//        return super.toString();
        return new Date((getValue() - 2208988800L) * 1000L).toString();
    }
}
