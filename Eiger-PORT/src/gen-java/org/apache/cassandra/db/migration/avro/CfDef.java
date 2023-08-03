/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.db.migration.avro;

@SuppressWarnings("all")
public class CfDef extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"CfDef\",\"namespace\":\"org.apache.cassandra.db.migration.avro\",\"fields\":[{\"name\":\"keyspace\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"column_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"comparator_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"subcomparator_type\",\"type\":[\"string\",\"null\"]},{\"name\":\"comment\",\"type\":[\"string\",\"null\"]},{\"name\":\"read_repair_chance\",\"type\":[\"double\",\"null\"]},{\"name\":\"replicate_on_write\",\"type\":\"boolean\",\"default\":false},{\"name\":\"gc_grace_seconds\",\"type\":[\"int\",\"null\"]},{\"name\":\"default_validation_class\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"key_validation_class\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"min_compaction_threshold\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"max_compaction_threshold\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"merge_shards_chance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"id\",\"type\":[\"int\",\"null\"]},{\"name\":\"column_metadata\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ColumnDef\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"validation_class\",\"type\":\"string\"},{\"name\":\"index_type\",\"type\":[{\"type\":\"enum\",\"name\":\"IndexType\",\"symbols\":[\"KEYS\",\"CUSTOM\"],\"aliases\":[\"org.apache.cassandra.config.avro.IndexType\"]},\"null\"]},{\"name\":\"index_name\",\"type\":[\"string\",\"null\"]},{\"name\":\"index_options\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"default\":null}],\"aliases\":[\"org.apache.cassandra.config.avro.ColumnDef\"]}},\"null\"]},{\"name\":\"key_alias\",\"type\":[\"null\",\"bytes\"],\"default\":null},{\"name\":\"compaction_strategy\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"compaction_strategy_options\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"default\":null},{\"name\":\"compression_options\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"default\":null},{\"name\":\"bloom_filter_fp_chance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"caching\",\"type\":[\"null\",\"string\"],\"default\":null}],\"aliases\":[\"org.apache.cassandra.config.avro.CfDef\"]}");
  public java.lang.CharSequence keyspace;
  public java.lang.CharSequence name;
  public java.lang.CharSequence column_type;
  public java.lang.CharSequence comparator_type;
  public java.lang.CharSequence subcomparator_type;
  public java.lang.CharSequence comment;
  public java.lang.Double read_repair_chance;
  public boolean replicate_on_write;
  public java.lang.Integer gc_grace_seconds;
  public java.lang.CharSequence default_validation_class;
  public java.lang.CharSequence key_validation_class;
  public java.lang.Integer min_compaction_threshold;
  public java.lang.Integer max_compaction_threshold;
  public java.lang.Double merge_shards_chance;
  public java.lang.Integer id;
  public java.util.List<org.apache.cassandra.db.migration.avro.ColumnDef> column_metadata;
  public java.nio.ByteBuffer key_alias;
  public java.lang.CharSequence compaction_strategy;
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> compaction_strategy_options;
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> compression_options;
  public java.lang.Double bloom_filter_fp_chance;
  public java.lang.CharSequence caching;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return keyspace;
    case 1: return name;
    case 2: return column_type;
    case 3: return comparator_type;
    case 4: return subcomparator_type;
    case 5: return comment;
    case 6: return read_repair_chance;
    case 7: return replicate_on_write;
    case 8: return gc_grace_seconds;
    case 9: return default_validation_class;
    case 10: return key_validation_class;
    case 11: return min_compaction_threshold;
    case 12: return max_compaction_threshold;
    case 13: return merge_shards_chance;
    case 14: return id;
    case 15: return column_metadata;
    case 16: return key_alias;
    case 17: return compaction_strategy;
    case 18: return compaction_strategy_options;
    case 19: return compression_options;
    case 20: return bloom_filter_fp_chance;
    case 21: return caching;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: keyspace = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: column_type = (java.lang.CharSequence)value$; break;
    case 3: comparator_type = (java.lang.CharSequence)value$; break;
    case 4: subcomparator_type = (java.lang.CharSequence)value$; break;
    case 5: comment = (java.lang.CharSequence)value$; break;
    case 6: read_repair_chance = (java.lang.Double)value$; break;
    case 7: replicate_on_write = (java.lang.Boolean)value$; break;
    case 8: gc_grace_seconds = (java.lang.Integer)value$; break;
    case 9: default_validation_class = (java.lang.CharSequence)value$; break;
    case 10: key_validation_class = (java.lang.CharSequence)value$; break;
    case 11: min_compaction_threshold = (java.lang.Integer)value$; break;
    case 12: max_compaction_threshold = (java.lang.Integer)value$; break;
    case 13: merge_shards_chance = (java.lang.Double)value$; break;
    case 14: id = (java.lang.Integer)value$; break;
    case 15: column_metadata = (java.util.List<org.apache.cassandra.db.migration.avro.ColumnDef>)value$; break;
    case 16: key_alias = (java.nio.ByteBuffer)value$; break;
    case 17: compaction_strategy = (java.lang.CharSequence)value$; break;
    case 18: compaction_strategy_options = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 19: compression_options = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 20: bloom_filter_fp_chance = (java.lang.Double)value$; break;
    case 21: caching = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
