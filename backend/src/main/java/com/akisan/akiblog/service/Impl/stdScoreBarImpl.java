package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.std_scorebar;
import com.akisan.akiblog.mapper.std_scorebarMapper;
import com.akisan.akiblog.service.stdScoreBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stdScoreBarImpl implements stdScoreBar {
    @Autowired
    std_scorebarMapper stdScorebarMapper;

    @Override
    public List<std_scorebar> returnScoreBar() {
        return stdScorebarMapper.getStdScoreAlarm();
    }
}
