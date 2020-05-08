package com.dumbdogdiner.betterwhitelist.discord.commands;

import com.dumbdogdiner.betterwhitelist.BaseClass;
import com.dumbdogdiner.betterwhitelist.discord.lib.Command;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class GetStatusCommand extends Command implements BaseClass {

    public GetStatusCommand() {
        this.name = "status";
        this.description = "Gets the bot's status.";
    }

    @Override
    public void run(MessageReceivedEvent e, String... args) {
        e.getChannel().sendMessage(String.format(
            getConfig().getString("lang.discord.status"),
            Math.round(getBot().getJDA().getGatewayPing()
        ))).queue();
    }
}