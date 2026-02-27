package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Event;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1393q extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5PF"));
        long jBeginMessage = protoReader.beginMessage();
        Boolean boolDecode = null;
        Boolean boolDecode2 = null;
        Boolean boolDecode3 = null;
        Integer numDecode = null;
        Integer numDecode2 = null;
        String strDecode = null;
        String strDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Event(boolDecode, boolDecode2, boolDecode3, numDecode, numDecode2, strDecode, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    boolDecode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    boolDecode2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    boolDecode3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    numDecode = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    numDecode2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Event event = (Event) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5PH"));
        kotlin.jvm.internal.j.g(event, numX49.tnTj78("bd5PO"));
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, event.getHasName());
        protoAdapter.encodeWithTag(protoWriter, 2, event.isOrganizer());
        protoAdapter.encodeWithTag(protoWriter, 3, event.isRecurring());
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 4, event.getAttendeesCount());
        protoAdapter2.encodeWithTag(protoWriter, 5, event.getConfirmedAttendeesCount());
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 6, event.getStart());
        protoAdapter3.encodeWithTag(protoWriter, 7, event.getEnd());
        protoWriter.writeBytes(event.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Event event = (Event) obj;
        kotlin.jvm.internal.j.g(event, numX49.tnTj78("bd5PU"));
        int size = event.unknownFields().size();
        ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
        int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, event.isRecurring()) + protoAdapter.encodedSizeWithTag(2, event.isOrganizer()) + protoAdapter.encodedSizeWithTag(1, event.getHasName()) + size;
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        int iEncodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, event.getConfirmedAttendeesCount()) + protoAdapter2.encodedSizeWithTag(4, event.getAttendeesCount()) + iEncodedSizeWithTag;
        ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
        return protoAdapter3.encodedSizeWithTag(7, event.getEnd()) + protoAdapter3.encodedSizeWithTag(6, event.getStart()) + iEncodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Event event = (Event) obj;
        kotlin.jvm.internal.j.g(event, numX49.tnTj78("bd5Pe"));
        return Event.copy$default(event, null, null, null, null, null, null, null, ByteString.EMPTY, 127, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Event event = (Event) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5PQ"));
        kotlin.jvm.internal.j.g(event, numX49.tnTj78("bd5Pt"));
        reverseProtoWriter.writeBytes(event.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, event.getEnd());
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, event.getStart());
        ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, event.getConfirmedAttendeesCount());
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, event.getAttendeesCount());
        ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, event.isRecurring());
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, event.isOrganizer());
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, event.getHasName());
    }
}
