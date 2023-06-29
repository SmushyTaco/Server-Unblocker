package com.smushytaco.server_unblocker.mixin;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.patchy.MojangBlockListSupplier;
import com.smushytaco.server_unblocker.ServerUnblocker;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import java.util.function.Predicate;
@Mixin(MojangBlockListSupplier.class)
public abstract class UnblockServers {
    @ModifyReturnValue(method = "createBlockList", at = @At("RETURN"), remap = false)
    @SuppressWarnings("unused")
    @Nullable
    private Predicate<String> hookCanAccept(Predicate<String> original) { return ServerUnblocker.INSTANCE.getConfig().getServersAreUnblocked() ? null : original; }
}