package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.measurement.MeasurementPoint;

/* JADX INFO: loaded from: classes2.dex */
public class UserActionFactoryImpl implements UserActionFactory {
    @Override // com.dynatrace.android.useraction.UserActionFactory
    public UserAction createUserAction(String str, MeasurementPoint measurementPoint) {
        return new DTXAutoActionWrapper(UserActionUtil.createNewAutoUserAction(str, measurementPoint));
    }
}
