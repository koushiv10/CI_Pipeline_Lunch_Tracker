package com.example;

import io.micronaut.core.optim.StaticOptimizations;
import io.micronaut.core.util.EnvironmentProperties;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentPropertiesOptimizationLoader implements StaticOptimizations.Loader<EnvironmentProperties> {
  private void load0(Map<String, List<String>> env) {
    env.put("PATH", Arrays.asList("path"));
    env.put("MANPATH", Arrays.asList("manpath"));
    env.put("TERM", Arrays.asList("term"));
    env.put("HOMEBREW_PREFIX", Arrays.asList("homebrew.prefix", "homebrew-prefix"));
    env.put("COMMAND_MODE", Arrays.asList("command.mode", "command-mode"));
    env.put("LOGNAME", Arrays.asList("logname"));
    env.put("HOMEBREW_REPOSITORY", Arrays.asList("homebrew.repository", "homebrew-repository"));
    env.put("PWD", Arrays.asList("pwd"));
    env.put("XPC_SERVICE_NAME", Arrays.asList("xpc.service.name", "xpc.service-name", "xpc-service.name", "xpc-service-name"));
    env.put("INFOPATH", Arrays.asList("infopath"));
    env.put("__CFBundleIdentifier", Arrays.asList("..cfbundleidentifier", ".-cfbundleidentifier", "-.cfbundleidentifier", "--cfbundleidentifier"));
    env.put("SHELL", Arrays.asList("shell"));
    env.put("PAGER", Arrays.asList("pager"));
    env.put("LSCOLORS", Arrays.asList("lscolors"));
    env.put("HOMEBREW_CELLAR", Arrays.asList("homebrew.cellar", "homebrew-cellar"));
    env.put("SECURITYSESSIONID", Arrays.asList("securitysessionid"));
    env.put("USER", Arrays.asList("user"));
    env.put("ZSH", Arrays.asList("zsh"));
    env.put("TERMINAL_EMULATOR", Arrays.asList("terminal.emulator", "terminal-emulator"));
    env.put("LaunchInstanceID", Arrays.asList("launchinstanceid"));
    env.put("TMPDIR", Arrays.asList("tmpdir"));
    env.put("SSH_AUTH_SOCK", Arrays.asList("ssh.auth.sock", "ssh.auth-sock", "ssh-auth.sock", "ssh-auth-sock"));
    env.put("XPC_FLAGS", Arrays.asList("xpc.flags", "xpc-flags"));
    env.put("TERM_SESSION_ID", Arrays.asList("term.session.id", "term.session-id", "term-session.id", "term-session-id"));
    env.put("__CF_USER_TEXT_ENCODING", Arrays.asList("..cf.user.text.encoding", "..cf.user.text-encoding", "..cf.user-text.encoding", "..cf.user-text-encoding", "..cf-user.text.encoding", "..cf-user.text-encoding", "..cf-user-text.encoding", "..cf-user-text-encoding", ".-cf.user.text.encoding", ".-cf.user.text-encoding", ".-cf.user-text.encoding", ".-cf.user-text-encoding", ".-cf-user.text.encoding", ".-cf-user.text-encoding", ".-cf-user-text.encoding", ".-cf-user-text-encoding", "-.cf.user.text.encoding", "-.cf.user.text-encoding", "-.cf.user-text.encoding", "-.cf.user-text-encoding", "-.cf-user.text.encoding", "-.cf-user.text-encoding", "-.cf-user-text.encoding", "-.cf-user-text-encoding", "--cf.user.text.encoding", "--cf.user.text-encoding", "--cf.user-text.encoding", "--cf.user-text-encoding", "--cf-user.text.encoding", "--cf-user.text-encoding", "--cf-user-text.encoding", "--cf-user-text-encoding"));
    env.put("LESS", Arrays.asList("less"));
    env.put("LC_CTYPE", Arrays.asList("lc.ctype", "lc-ctype"));
    env.put("LS_COLORS", Arrays.asList("ls.colors", "ls-colors"));
    env.put("IDEA_INITIAL_DIRECTORY", Arrays.asList("idea.initial.directory", "idea.initial-directory", "idea-initial.directory", "idea-initial-directory"));
    env.put("HOME", Arrays.asList("home"));
    env.put("SHLVL", Arrays.asList("shlvl"));
  }

  @Override
  public EnvironmentProperties load() {
    Map<String, List<String>> env = new HashMap<String, List<String>>();
    load0(env);
    return EnvironmentProperties.of(env);
  }
}
