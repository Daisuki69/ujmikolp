package com.paymaya.domain.model;

import java.util.Locale;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public interface Dated {
    DateTime getLocalDateTime();

    String getLocalDateTimeForDateHeader(Locale locale);

    String getLocalDateTimeForDisplay(Locale locale);

    String getMayaLocalDateTimeForDateHeader(Locale locale, boolean z4);
}
