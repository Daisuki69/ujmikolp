package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.ExtractionDetails;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1396u extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5bT"));
        long jBeginMessage = protoReader.beginMessage();
        String strTnTj78 = numX49.tnTj78("bd5bR");
        long jLongValue = 0;
        String strDecode = strTnTj78;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new ExtractionDetails(strTnTj78, strDecode, jLongValue, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strTnTj78 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                jLongValue = ProtoAdapter.INT64.decode(protoReader).longValue();
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        ExtractionDetails extractionDetails = (ExtractionDetails) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5bp"));
        kotlin.jvm.internal.j.g(extractionDetails, numX49.tnTj78("bd5b0"));
        String extractionStart = extractionDetails.getExtractionStart();
        String strTnTj78 = numX49.tnTj78("bd5bg");
        if (!kotlin.jvm.internal.j.b(extractionStart, strTnTj78)) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extractionDetails.getExtractionStart());
        }
        if (!kotlin.jvm.internal.j.b(extractionDetails.getExtractionEnd(), strTnTj78)) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, extractionDetails.getExtractionEnd());
        }
        if (extractionDetails.getDuration() != 0) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, Long.valueOf(extractionDetails.getDuration()));
        }
        protoWriter.writeBytes(extractionDetails.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExtractionDetails extractionDetails = (ExtractionDetails) obj;
        kotlin.jvm.internal.j.g(extractionDetails, numX49.tnTj78("bd5bx"));
        int size = extractionDetails.unknownFields().size();
        String extractionStart = extractionDetails.getExtractionStart();
        String strTnTj78 = numX49.tnTj78("bd5bs");
        if (!kotlin.jvm.internal.j.b(extractionStart, strTnTj78)) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, extractionDetails.getExtractionStart());
        }
        if (!kotlin.jvm.internal.j.b(extractionDetails.getExtractionEnd(), strTnTj78)) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, extractionDetails.getExtractionEnd());
        }
        return extractionDetails.getDuration() != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(extractionDetails.getDuration())) + size : size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExtractionDetails extractionDetails = (ExtractionDetails) obj;
        kotlin.jvm.internal.j.g(extractionDetails, numX49.tnTj78("bd5b5"));
        return ExtractionDetails.copy$default(extractionDetails, null, null, 0L, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        ExtractionDetails extractionDetails = (ExtractionDetails) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5bf"));
        kotlin.jvm.internal.j.g(extractionDetails, numX49.tnTj78("bd5b1"));
        reverseProtoWriter.writeBytes(extractionDetails.unknownFields());
        if (extractionDetails.getDuration() != 0) {
            ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, Long.valueOf(extractionDetails.getDuration()));
        }
        String extractionEnd = extractionDetails.getExtractionEnd();
        String strTnTj78 = numX49.tnTj78("bd5bn");
        if (!kotlin.jvm.internal.j.b(extractionEnd, strTnTj78)) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, extractionDetails.getExtractionEnd());
        }
        if (kotlin.jvm.internal.j.b(extractionDetails.getExtractionStart(), strTnTj78)) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, extractionDetails.getExtractionStart());
    }
}
