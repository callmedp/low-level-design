package com.example.trueCaller.model;


import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import orestes.bloomfilter.CountingBloomFilter;
import orestes.bloomfilter.FilterBuilder;

import java.nio.charset.Charset;

import static com.example.trueCaller.model.Constants.MAX_GLOBAL_SPAM_COUNT;

public class GlobalSpam {
    private BloomFilter<String> globalBlocked = BloomFilter.create(
            Funnels.stringFunnel(Charset.forName("UTF-8")), MAX_GLOBAL_SPAM_COUNT);

    private CountingBloomFilter<String> globalSpam = new FilterBuilder(
            MAX_GLOBAL_SPAM_COUNT, .01)
            .buildCountingBloomFilter();

    private GlobalSpam () {}

    public static GlobalSpam INSTANCE = new GlobalSpam();

    public void reportSpam(String spamNumber, String reportingNumber, String reason) {
        System.out.println("Send metrics here for spam number " + spamNumber
               + " reported" + reportingNumber + " for reason " + reason);
    }
}
