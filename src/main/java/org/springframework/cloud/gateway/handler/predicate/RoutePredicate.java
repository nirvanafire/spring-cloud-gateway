package org.springframework.cloud.gateway.handler.predicate;

import java.util.function.Predicate;

import org.springframework.util.Assert;
import org.springframework.web.server.ServerWebExchange;

/**
 * @author Spencer Gibb
 */
public interface RoutePredicate {

	Predicate<ServerWebExchange> apply(String value, String[] args);

	default void validate(String[] args, int requiredSize) {
		Assert.isTrue(args != null && args.length == requiredSize,
				"args must have "+ requiredSize +" entry(s)");
	}
}
