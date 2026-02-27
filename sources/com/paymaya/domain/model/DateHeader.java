package com.paymaya.domain.model;

import com.paymaya.common.utility.AbstractC1234x;
import java.util.Locale;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public class DateHeader implements Dated {
    private DateTime mLocalDateTime;

    public DateHeader(DateTime dateTime) {
        this.mLocalDateTime = dateTime;
    }

    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && hashCode() == obj.hashCode();
    }

    @Override // com.paymaya.domain.model.Dated
    public DateTime getLocalDateTime() {
        return this.mLocalDateTime;
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDateHeader(Locale locale) {
        return getLocalDateTimeForDisplay(locale);
    }

    @Override // com.paymaya.domain.model.Dated
    public String getLocalDateTimeForDisplay(Locale locale) {
        DateTime localDateTime = getLocalDateTime();
        return AbstractC1234x.n(localDateTime) ? AbstractC1234x.f11265y : AbstractC1234x.f11248a.withLocale(AbstractC1234x.l()).print(localDateTime);
    }

    @Override // com.paymaya.domain.model.Dated
    public String getMayaLocalDateTimeForDateHeader(Locale locale, boolean z4) {
        DateTime localDateTime = getLocalDateTime();
        String strH = AbstractC1234x.n(localDateTime) ? AbstractC1234x.f11265y : AbstractC1234x.h(localDateTime);
        return z4 ? strH.toUpperCase(locale) : strH;
    }

    public int hashCode() {
        return this.mLocalDateTime.toString().hashCode();
    }

    public String getMayaLocalDateTimeForDateHeader(Locale locale) {
        return getMayaLocalDateTimeForDateHeader(locale, true);
    }
}
