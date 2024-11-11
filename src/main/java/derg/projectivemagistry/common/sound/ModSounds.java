package derg.projectivemagistry.common.sound;

import derg.projectivemagistry.ProjectiveMagistry;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent PENIS_EEK = registerSoundEvent("penis_eek");
    public static final RegistryKey<JukeboxSong> PENIS_EEK_KEY = of("penis_eek");

    private static RegistryKey<JukeboxSong> of(String name){
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ProjectiveMagistry.MOD_ID,name));
    }

    private static SoundEvent registerSoundEvent(String name){
        return Registry.register(Registries.SOUND_EVENT, Identifier.of(ProjectiveMagistry.MOD_ID, name),
            SoundEvent.of(Identifier.of(ProjectiveMagistry.MOD_ID,name)));
    }
    public static void registerSounds() {
        ProjectiveMagistry.LOGGER.info("Registering mod sounds for " + ProjectiveMagistry.MOD_ID);
    }
}
