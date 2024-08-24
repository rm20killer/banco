package ovh.mythmc.banco.api.event.impl;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import ovh.mythmc.banco.api.event.BancoEvent;
import ovh.mythmc.banco.api.items.BancoItem;

@Getter
@Accessors(fluent = true)
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
/**
 * Called when a BancoItem is registered
 */
public final class BancoItemRegisterEvent implements BancoEvent {
    private final @NotNull BancoItem bancoItem;
}
