package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Volume;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd52E"));
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        Boolean boolDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Volume(strDecode, strDecode2, boolDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                boolDecode = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Volume volume = (Volume) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd52F"));
        kotlin.jvm.internal.j.g(volume, numX49.tnTj78("bd52H"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, volume.getTotalSize());
        protoAdapter.encodeWithTag(protoWriter, 2, volume.getAvailableSize());
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, volume.isRemovable());
        protoWriter.writeBytes(volume.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Volume volume = (Volume) obj;
        kotlin.jvm.internal.j.g(volume, numX49.tnTj78("bd52t"));
        int size = volume.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, volume.isRemovable()) + protoAdapter.encodedSizeWithTag(2, volume.getAvailableSize()) + protoAdapter.encodedSizeWithTag(1, volume.getTotalSize()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Volume volume = (Volume) obj;
        kotlin.jvm.internal.j.g(volume, numX49.tnTj78("bd52U"));
        return Volume.copy$default(volume, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Volume volume = (Volume) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd52O"));
        kotlin.jvm.internal.j.g(volume, numX49.tnTj78("bd52Q"));
        reverseProtoWriter.writeBytes(volume.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, volume.isRemovable());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, volume.getAvailableSize());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, volume.getTotalSize());
    }
}
