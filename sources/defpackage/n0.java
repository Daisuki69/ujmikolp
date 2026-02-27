package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        long jBeginMessage = protoReader.beginMessage();
        Long lDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Performance(lDecode, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                lDecode = ProtoAdapter.INT64.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(Extractor.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Performance value = (Performance) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter.INT64.encodeWithTag(writer, 1, value.getDuration());
        Extractor.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getExtractors());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Performance value = (Performance) obj;
        j.g(value, "value");
        return Extractor.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getExtractors()) + ProtoAdapter.INT64.encodedSizeWithTag(1, value.getDuration()) + value.unknownFields().size();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Performance value = (Performance) obj;
        j.g(value, "value");
        return Performance.copy$default(value, null, Internal.m186redactElements(value.getExtractors(), Extractor.ADAPTER), ByteString.EMPTY, 1, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Performance value = (Performance) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        Extractor.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getExtractors());
        ProtoAdapter.INT64.encodeWithTag(writer, 1, value.getDuration());
    }
}
