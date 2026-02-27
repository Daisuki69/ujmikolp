package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.GPS;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1367A extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5E"));
        long jBeginMessage = protoReader.beginMessage();
        Double dDecode = null;
        Double dDecode2 = null;
        Boolean boolDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new GPS(dDecode, dDecode2, boolDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                dDecode = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (iNextTag == 2) {
                dDecode2 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                boolDecode = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        GPS gps = (GPS) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5F"));
        kotlin.jvm.internal.j.g(gps, numX49.tnTj78("bd5H"));
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, gps.getLatitude());
        protoAdapter.encodeWithTag(protoWriter, 2, gps.getLongitude());
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, gps.isMock());
        protoWriter.writeBytes(gps.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GPS gps = (GPS) obj;
        kotlin.jvm.internal.j.g(gps, numX49.tnTj78("bd5t"));
        int size = gps.unknownFields().size();
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, gps.isMock()) + protoAdapter.encodedSizeWithTag(2, gps.getLongitude()) + protoAdapter.encodedSizeWithTag(1, gps.getLatitude()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GPS gps = (GPS) obj;
        kotlin.jvm.internal.j.g(gps, numX49.tnTj78("bd5U"));
        return GPS.copy$default(gps, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        GPS gps = (GPS) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5O"));
        kotlin.jvm.internal.j.g(gps, numX49.tnTj78("bd5Q"));
        reverseProtoWriter.writeBytes(gps.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, gps.isMock());
        ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, gps.getLongitude());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, gps.getLatitude());
    }
}
