package wearblackallday.dimthread.init;

import net.minecraft.world.GameRules;
import wearblackallday.dimthread.gamerule.BoolRule;
import wearblackallday.dimthread.gamerule.IntRule;
import wearblackallday.dimthread.util.ServerManager;

public class ModGameRules {

	public static BoolRule ACTIVE;
	public static IntRule THREAD_COUNT;

	public static void registerGameRules() {
		ACTIVE = BoolRule.builder("active", GameRules.Category.UPDATES).setInitial(true)
				.setCallback(ServerManager::setActive).build();

		THREAD_COUNT = IntRule.builder("thread_count", GameRules.Category.UPDATES).setInitial(3)
				.setBounds(1, Runtime.getRuntime().availableProcessors()).setCallback(ServerManager::setThreadCount).build();
	}

}
