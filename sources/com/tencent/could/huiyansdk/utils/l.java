package com.tencent.could.huiyansdk.utils;

import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class l extends ArrayList<HuiYanAuthEvent> {
    public l(m mVar) {
        add(HuiYanAuthEvent.OPEN_MOUTH_CHECK_DONE);
        add(HuiYanAuthEvent.SILENCE_CHECK_DONE);
        add(HuiYanAuthEvent.BLINK_CHECK_DONE);
        add(HuiYanAuthEvent.NOD_HEAD_CHECK_DONE);
        add(HuiYanAuthEvent.SHAKE_HEAD_CHECK_DONE);
    }
}
