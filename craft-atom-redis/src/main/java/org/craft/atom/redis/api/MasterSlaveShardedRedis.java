package org.craft.atom.redis.api;

import java.util.List;

/**
 * The master slave sharded redis client.
 * 
 * @author mindwind
 * @version 1.0, Jun 25, 2013
 */
public interface MasterSlaveShardedRedis extends ShardedRedisCommand {
	
	/** 
	 * @return all shards
	 */
	List<MasterSlaveRedis> shards();
	
	/**
	 * Set all <code>MasterSlaveRedis</code> shard read from slave and write on master.
	 * 
	 * @see MasterSlaveRedis#readSlave()
	 */
	void readSlave();
	
}
