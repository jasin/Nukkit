package cn.nukkit.server.item;

import cn.nukkit.server.network.protocol.LevelSoundEventPacket;

/**
 * @author CreeperFace
 */
public class ItemRecordStrad extends ItemRecord {

    public ItemRecordStrad() {
        this(0, 1);
    }

    public ItemRecordStrad(Integer meta) {
        this(meta, 1);
    }

    public ItemRecordStrad(Integer meta, int count) {
        super(meta, count);
    }

    @Override
    public int getSoundId() {
        return LevelSoundEventPacket.SOUND_RECORD_STRAD;
    }
}