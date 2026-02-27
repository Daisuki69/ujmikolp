package com.dynatrace.agent.communication.filter;

import cj.C1110A;
import cj.C1112C;
import com.dynatrace.agent.storage.db.EventMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class EventRecordSizeFilter {
    private final int envelopeSize;

    public EventRecordSizeFilter(int i) {
        this.envelopeSize = i;
    }

    public final List<EventMetadata> filterByBodySize$com_dynatrace_agent_release(List<EventMetadata> metadata, long j, int i) {
        j.g(metadata, "metadata");
        if (metadata.isEmpty()) {
            return metadata;
        }
        ArrayList arrayList = new ArrayList();
        for (EventMetadata eventMetadata : metadata) {
            i += eventMetadata.getEventSizeBytes() + 1;
            if (i - 1 > j) {
                break;
            }
            arrayList.add(eventMetadata);
        }
        return arrayList;
    }

    public final Pair<List<EventMetadata>, List<EventMetadata>> filterTooBigRecords$com_dynatrace_agent_release(List<EventMetadata> metadata, long j) {
        List<EventMetadata> listFilterByBodySize$com_dynatrace_agent_release;
        j.g(metadata, "metadata");
        if (metadata.isEmpty()) {
            C1112C c1112c = C1112C.f9377a;
            return new Pair<>(c1112c, c1112c);
        }
        ArrayList arrayListW = C1110A.W(metadata);
        ArrayList arrayList = new ArrayList();
        do {
            listFilterByBodySize$com_dynatrace_agent_release = filterByBodySize$com_dynatrace_agent_release(arrayListW, j, this.envelopeSize);
            if (listFilterByBodySize$com_dynatrace_agent_release.isEmpty()) {
                EventMetadata eventMetadata = (EventMetadata) C1110A.A(arrayListW);
                arrayList.add(eventMetadata);
                arrayListW.remove(eventMetadata);
            }
            if (!listFilterByBodySize$com_dynatrace_agent_release.isEmpty()) {
                break;
            }
        } while (!arrayListW.isEmpty());
        return new Pair<>(listFilterByBodySize$com_dynatrace_agent_release, arrayList);
    }
}
