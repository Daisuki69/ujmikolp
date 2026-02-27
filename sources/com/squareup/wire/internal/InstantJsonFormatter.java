package com.squareup.wire.internal;

import com.shield.android.internal.j;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes4.dex */
public final class InstantJsonFormatter implements JsonFormatter<Instant> {
    public static final InstantJsonFormatter INSTANCE = new InstantJsonFormatter();

    private InstantJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public /* bridge */ /* synthetic */ Object toStringOrNumber(Instant instant) {
        return toStringOrNumber2(j.r(instant));
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Instant fromString(String value) {
        kotlin.jvm.internal.j.g(value, "value");
        DateTimeFormatter unused = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        Instant instantFrom = Instant.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(value));
        kotlin.jvm.internal.j.f(instantFrom, "from(...)");
        return instantFrom;
    }

    /* JADX INFO: renamed from: toStringOrNumber, reason: avoid collision after fix types in other method */
    public Object toStringOrNumber2(Instant value) {
        kotlin.jvm.internal.j.g(value, "value");
        DateTimeFormatter unused = DateTimeFormatter.ISO_INSTANT;
        String str = DateTimeFormatter.ISO_INSTANT.format(j.u(value));
        kotlin.jvm.internal.j.f(str, "format(...)");
        return str;
    }
}
