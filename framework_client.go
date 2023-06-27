package main

import (
	"context"
	"fmt"
	"log"
	"time"

	pb "github.com/shawnz99/Eiger-PORT"

	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
)

func main() {
	conn, err := grpc.Dial("localhost:8020", grpc.WithTransportCredentials(insecure.NewCredentials()))
	if err != nil {
		log.Fatalf("Did not connect: %v", err)
	}
	defer conn.Close()
	c := pb.NewWorkloadClient(conn)

	// Contact server and print resp
	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	// Prepare read
	readReq := &pb.ReadRequest{
		Key: "hello",
	}
	r, err := c.Read(ctx, readReq)
	if err != nil {
		log.Fatalf("Reads Failed: %v", err)
	}
	fmt.Printf("Read response: %s\n", r.Value)

	// Prepare Write
	writeReq := &pb.WriteRequest{
		Key:   "howdy",
		Value: "World",
	}
	writeResp, err := c.Write(ctx, writeReq)
	if err != nil {
		log.Fatalf("Write failed: %v", err)
	}
	fmt.Printf("Write response: %v\n", writeResp.Success)

}
