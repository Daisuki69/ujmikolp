package com.dynatrace.android.callback;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class ServerTimingAnalyzer {
    static final String DTSINFO_PATTERN = "(?:dtSInfo;desc=\"?)(.*?)(?:\"|;|$)";
    static final int MAX_LENGTH = 50;
    private final int maxLength;
    private final Pattern pattern;

    public ServerTimingAnalyzer() {
        this(DTSINFO_PATTERN, 50);
    }

    public String analyze(List<String> list) {
        if (list == null) {
            return null;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Matcher matcher = this.pattern.matcher(it.next());
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup == null) {
                    return strGroup;
                }
                int length = strGroup.length();
                int i = this.maxLength;
                return length > i ? strGroup.substring(0, i) : strGroup;
            }
        }
        return null;
    }

    public ServerTimingAnalyzer(String str, int i) {
        this.pattern = Pattern.compile(str);
        this.maxLength = i;
    }
}
