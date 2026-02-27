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

/* JADX INFO: renamed from: p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1999p extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        long jBeginMessage = protoReader.beginMessage();
        Dimension dimensionDecode = null;
        Dimension dimensionDecode2 = null;
        String strDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Camera(dimensionDecode, dimensionDecode2, arrayListJ, strDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                dimensionDecode = Dimension.ADAPTER.decode(protoReader);
            } else if (iNextTag == 2) {
                dimensionDecode2 = Dimension.ADAPTER.decode(protoReader);
            } else if (iNextTag == 3) {
                arrayListJ.add(Dimension.ADAPTER.decode(protoReader));
            } else if (iNextTag != 4) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Camera value = (Camera) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<Dimension> protoAdapter = Dimension.ADAPTER;
        protoAdapter.encodeWithTag(writer, 1, value.getMax_resolution());
        protoAdapter.encodeWithTag(writer, 2, value.getDefault_resolution());
        protoAdapter.asRepeated().encodeWithTag(writer, 3, value.getSupported_resolutions());
        ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getVersion());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Camera value = (Camera) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<Dimension> protoAdapter = Dimension.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, value.getVersion()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getSupported_resolutions()) + protoAdapter.encodedSizeWithTag(2, value.getDefault_resolution()) + protoAdapter.encodedSizeWithTag(1, value.getMax_resolution()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Camera value = (Camera) obj;
        j.g(value, "value");
        Dimension max_resolution = value.getMax_resolution();
        Dimension dimensionRedact = max_resolution != null ? Dimension.ADAPTER.redact(max_resolution) : null;
        Dimension default_resolution = value.getDefault_resolution();
        return Camera.copy$default(value, dimensionRedact, default_resolution != null ? Dimension.ADAPTER.redact(default_resolution) : null, Internal.m186redactElements(value.getSupported_resolutions(), Dimension.ADAPTER), null, ByteString.EMPTY, 8, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Camera value = (Camera) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getVersion());
        ProtoAdapter<Dimension> protoAdapter = Dimension.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(writer, 3, value.getSupported_resolutions());
        protoAdapter.encodeWithTag(writer, 2, value.getDefault_resolution());
        protoAdapter.encodeWithTag(writer, 1, value.getMax_resolution());
    }
}
