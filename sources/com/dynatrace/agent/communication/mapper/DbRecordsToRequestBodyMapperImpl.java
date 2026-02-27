package com.dynatrace.agent.communication.mapper;

import We.s;
import com.dynatrace.agent.storage.db.EventRecord;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public final class DbRecordsToRequestBodyMapperImpl implements DbRecordsToRequestBodyMapper {
    public static final Companion Companion = new Companion(null);
    private static final String DATA_VERSION = "{\"data_version\":";
    private static final String JSON_ENDING = "]}}";
    private static final String JSON_EVENTS = ",\"data\":{\"events\":[";
    private final int dataVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getEnvelopSize$com_dynatrace_agent_release(int i) {
            String string = getEnvelopeHeader$com_dynatrace_agent_release(i).toString();
            j.f(string, "toString(...)");
            Charset charset = C2581c.f21468b;
            byte[] bytes = string.getBytes(charset);
            j.f(bytes, "getBytes(...)");
            int length = bytes.length;
            byte[] bytes2 = DbRecordsToRequestBodyMapperImpl.JSON_ENDING.getBytes(charset);
            j.f(bytes2, "getBytes(...)");
            return length + bytes2.length;
        }

        public final StringBuilder getEnvelopeHeader$com_dynatrace_agent_release(int i) {
            return s.t(i, DbRecordsToRequestBodyMapperImpl.DATA_VERSION, DbRecordsToRequestBodyMapperImpl.JSON_EVENTS);
        }

        private Companion() {
        }
    }

    public DbRecordsToRequestBodyMapperImpl(int i) {
        this.dataVersion = i;
    }

    @Override // com.dynatrace.agent.communication.mapper.DbRecordsToRequestBodyMapper
    public int getDataVersion() {
        return this.dataVersion;
    }

    @Override // com.dynatrace.agent.common.Mapper
    public /* bridge */ /* synthetic */ String map(List<? extends EventRecord> list) {
        return map2((List<EventRecord>) list);
    }

    /* JADX INFO: renamed from: map, reason: avoid collision after fix types in other method */
    public String map2(List<EventRecord> input) {
        j.g(input, "input");
        StringBuilder envelopeHeader$com_dynatrace_agent_release = Companion.getEnvelopeHeader$com_dynatrace_agent_release(getDataVersion());
        Iterator<T> it = input.iterator();
        while (it.hasNext()) {
            envelopeHeader$com_dynatrace_agent_release.append(((EventRecord) it.next()).getEvent() + ',');
        }
        if (!input.isEmpty()) {
            j.f(envelopeHeader$com_dynatrace_agent_release.deleteCharAt(C2576A.B(envelopeHeader$com_dynatrace_agent_release)), "deleteCharAt(...)");
        }
        envelopeHeader$com_dynatrace_agent_release.append(JSON_ENDING);
        String string = envelopeHeader$com_dynatrace_agent_release.toString();
        j.f(string, "toString(...)");
        return string;
    }
}
