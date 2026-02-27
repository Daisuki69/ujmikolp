package com.dynatrace.agent.storage.preference;

import com.dynatrace.agent.storage.db.EndPointInfo;
import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface EndPointInfoDataSource {
    Object clearPreferences(InterfaceC1526a<? super Unit> interfaceC1526a);

    Object getEndPointInfo(InterfaceC1526a<? super EndPointInfo> interfaceC1526a);

    Object setEndPointInfo(EndPointInfo endPointInfo, InterfaceC1526a<? super Unit> interfaceC1526a);
}
