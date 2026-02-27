package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.measurement.MeasurementPoint;

/* JADX INFO: loaded from: classes2.dex */
public interface UserActionFactory {
    UserAction createUserAction(String str, MeasurementPoint measurementPoint);
}
